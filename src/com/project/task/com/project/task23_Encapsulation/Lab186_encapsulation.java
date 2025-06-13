package com.project.task23_Encapsulation;

public class Lab186_encapsulation
{
    public static void main(String[] args)
    {
        vwo_login_page v = new vwo_login_page("admin", "Pass123");
        System.out.println(v.password);
        v.password = "pass345";

        Good_vwo_login_page g = new Good_vwo_login_page("bhagya", "Pass567");
        System.out.println(g.getPassword());
        System.out.println(g.getUsername());
         g.setUsername("kavya123");
         //g.setPassword --> not able to set the password., without getter and setter methods
        g.setPassword("jhon123", true); // if admin is false it is not allowed to change
        System.out.println(g.getPassword());
    }
}
class vwo_login_page { // this class is not good practice , it will be accessible, easy to change for everyone
    public String Username;
    public String password;

    //parameterized constructor
    public vwo_login_page(String username, String password) {
        this.Username = username;
        this.password = password;
    }
}

class Good_vwo_login_page  // this class is good practice
    {
        private String Username ;
        private String Password;

        //parameterized constructor
        public Good_vwo_login_page(String username, String password)
        {
            Username = username;
            Password = password;
        }

        //getter and setter methods
        public String getUsername()
        {
            return Username;
        }

        public void setUsername(String username)
        {
            this.Username = username;
        }

        public String getPassword()
        {
            return Password;
        }

        public void setPassword(String password,boolean isadmin)
        {
            if(isadmin) // if this condition is passed , then password change is allowed
           this. Password = password;
            else
            {
                System.out.println("Not allowed to set the password , you are not an admin");
            }
        }
    }

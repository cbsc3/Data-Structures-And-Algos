package com.company;

public class Main {

    static void truth(int dv, int uv, int am){
        if(dv > am){
            System.out.println("It looks as if this user has more downvotes");
        }
        else{
            System.out.println("This user has a moderate ammount of downvotes");
        }

        int orgNum = dv / 2;

        if(orgNum == am){
            System.out.println("This user has half as much downvotes as posts, this is a concerning rate");
        }

        if(uv < am){
            System.out.println("This user is in a safe place");
        }

        if(uv == 0 && am > 10){
            System.out.println("This user very acurate");
        }




    }


    static void timeAndDownvote(int m, int y, int downvotes){
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String selMonth = months[m - 1];
        int getCurrentTime = 2022 - y;
        System.out.println("The user joined in " + selMonth + " " + getCurrentTime + " " + "years ago");
        if(getCurrentTime > 10 && downvotes < 10){
             System.out.println("This is person has been a user for 10 years and has a very nice amount of downvotes and upvote");

        }

        if(getCurrentTime < 5 && downvotes > 30){
            System.out.println("This user has a potential to be downvoted!");
        }





    }

    public static void main(String[] args) {
        truth(25, 10, 10);
        timeAndDownvote(2, 2021, 15);
    }
}

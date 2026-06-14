package itspecialist.momo;

import java.util.Scanner;

public class Momo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Mobile  ");
        System.out.println("======================================");
        System.out.println("Select the best Option \n1: Send Money \n2: Airtime/bunbles \n3) Pay with MoMo \n4) Payments \n5) Saving&Loans \n6) Financial Services \n7) Invest&Insure \n8) My Account ");
        
        int option = input.nextInt();
        
        switch(option){
            case 1 : 
                System.out.println("Send Money \n1) Mobile User \n2) Outside Uganda \n3) Donations \n4) Send to Bank Account \n0) Back ");
                int m = input.nextInt();
                switch(m){
                    case 1 : 
                        System.out.println("Enter number that you are sending to ");
                        break;
                    case 2 : 
                        System.out.println("Send to Africa (Mobile Networks) \n2) Send to Other Wallets \n3) Send to Bank Account \n4) Cash Pickc Up");
                        break; 
                    case 3 : 
                        System.out.println("Enter number that you are sending to ");
                        break; 
                    case 4 : 
                        System.out.println("Enter number that you are sending to ");
                        break;
                        
                        
                }
                break;
            case 2 : 
                System.out.println("Airtime / Bundles \n1) Airtime \n2) Voice Bunble \n3) Internet Bunbles \n4) Freedom Bundles \n5) Special Bundle \n6) MTN WakaNet \n7) SMS Bundles \n0) Back ");
                break;
            case 3 : 
                System.out.println("Pay with MoMo \n Please Enter Merchant Code or invoice ID");
                break;
            case 4 : 
                System.out.println("Payments \n1) Utilities \n2) Pay TV \n3) School Fees \n4) Goods&Services \n5) Fees&Taxes \n6) Lotto&Betting \n7) Religious Institutions \n0) Back \n00) Next ");
                break;
            case 5 : 
                System.out.println("Saving&Loans \n1) MoKash \n2) Smart Phones \n3) MoMo Adavane \n4) MoPESA \n5) MoSente \n6) XtraCash \n7) Xeno  \n0) Back \n00) Next ");
                break;
                
            case 6 : 
                System.out.println("Financial Services \n1) Send to Bank Account \n2) Get Money from Bank \n3) SACCO \n4) Pension schemes \n5) MoMoCard \n6) Uganda Securities Exchange   \n0) Back ");
                break;
                
            case 7 : 
                System.out.println("Invest&Insure \n1) Invest with MoMo \n2) Insure with MoMo  \n3) MoMo Adavane \n0) Back  ");
                break;
                
            case 9 : 
                System.out.println("My Account \n1) Check Balance  \n2) Fees Calculate  \n3) My Approvals  \n4) My Transcations  \n5) Change PIN  \n6) PIN reset  \n7) Initiate Reversal \n0) Back \n00) Next ");
                break;
        }
                
    }
}

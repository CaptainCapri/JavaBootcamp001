package com.michaelhoffmann;

public class Number_of_days_in_Month {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(2,2018));

    }

    public static boolean isLeapYear(int year){
        int leap4 = year % 4;
        int leap100 = year % 100;
        int leap400 = year % 400;

        if((year < 1) || (year > 9999)){
            return false;
        }else if((leap4 == 0 && leap100 != 0)){
            return true;

        }else if (leap400 == 0){
            return true;

        }else{
            return false;
        }


    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999) return -1;
        else {
            switch(month) {
                case 1:
                    return 31;
                    //break;
                case 2:
                    if (isLeapYear(year)) return 29;
                    else return 28;
                    //break;
                case 3:
                    return 31;
                    //break;
                case 4:
                    return 30;
                    //break;
                case 5:
                    return 31;
                    //break;
                case 6:
                    return 30;
                    //break;
                case 7:
                    return 31;
                    //break;
                case 8:
                    return 31;
                    //break;
                case 9:
                    return 30;
                    //break;
                case 10:
                    return 31;
                    //break;
                case 11:
                    return 30;
                    //break;
                case 12:
                    return 31;
                    //break;
                default:
                    return -1;
            }
        }


    }




}

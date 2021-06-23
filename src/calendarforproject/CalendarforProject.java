/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarforproject;
enum MONTHS
{
	Jan, Feb, March, Apr, May, June, July, Aug, Sep, Oct, Nov, Dec;
}

/**
 *
 * @author HP
 */
public class CalendarforProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Login obj=new Login();
        obj.setBounds(0,0,1940,1050);
        obj.setTitle("Calendar");
        obj.setResizable(true);
        obj.setVisible(true);
    }
    
}

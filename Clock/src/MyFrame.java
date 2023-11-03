import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame{
	 Calendar calendar;
	 SimpleDateFormat timeFormat;
	 SimpleDateFormat dayFormat;
	 SimpleDateFormat dateFormat;
	 JLabel timeLabel;
	 JLabel dayLabel;
	 JLabel dateLabel;
	 String time;
	 String day;
	 String date;
	 
	 // Prayer time
	 JLabel prayerLabel;
	 JLabel teamname;

	 MyFrame(){
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setTitle("Dynamic's Digital Clock");
		 this.setLayout(new FlowLayout());
		 this.setSize(850, 500);
		 this.setResizable(true);
	  
		 timeFormat = new SimpleDateFormat("hh:mm:ss a");
		 dayFormat = new SimpleDateFormat("EEEE");
		 dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
	  
		 // Time Design
		 timeLabel = new JLabel();
		 timeLabel.setFont(new Font("Digital-7", Font.PLAIN, 120));
		 timeLabel.setForeground(new Color(0x08bd99));
		 //timeLabel.setBackground(new Color(0x7a3312));
		 timeLabel.setOpaque(true);
		 timeLabel.setPreferredSize(new Dimension(600, 200));
		 timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
	  
		 // Day Design
		 dayLabel = new JLabel();
		 dayLabel.setFont(new Font("Ariel",Font.PLAIN,35));
		 dayLabel.setPreferredSize(new Dimension(800, 40));
		 dayLabel.setHorizontalAlignment(SwingConstants.CENTER);

		 // Date Design
		 dateLabel = new JLabel();
		 dateLabel.setFont(new Font("Ariel",Font.PLAIN,25));
		 dateLabel.setPreferredSize(new Dimension(800, 40));
		 dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 
		 
		 // Prayer Time
		 prayerLabel = new JLabel();
		 prayerLabel.setFont(new Font("SutonnyMJ",Font.PLAIN,25));
		 prayerLabel.setPreferredSize(new Dimension(800, 50));
		 prayerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 // Prayer Time Finished
		 
		 // team name 
		 teamname = new JLabel();
		 teamname.setFont(new Font("Arial",Font.ITALIC,15));
		 teamname.setPreferredSize(new Dimension(800, 50));
		 teamname.setHorizontalAlignment(SwingConstants.RIGHT);
		 teamname.setForeground(new Color(0x833714 ));
		 // team name Finished
	  
	  
		 this.add(timeLabel);
		 this.add(dayLabel);
		 this.add(dateLabel);
		 this.add(prayerLabel);
		 this.add(teamname);

		 this.setVisible(true);
	  
		 setTime();
	 }
	 
	 public void setTime() {
		 while(true) {
			 time = timeFormat.format(Calendar.getInstance().getTime());
			 timeLabel.setText(time);
	  
			 day = dayFormat.format(Calendar.getInstance().getTime());
			 dayLabel.setText(day);
	  
			 date = dateFormat.format(Calendar.getInstance().getTime());
			 dateLabel.setText(date);
			 
			 // Prayer time
			 prayerLabel.setText("<html>" + "</br>" +
					 "dRi: 04:50, " + 
					 "‡hvni: 01:30, " + 
					 "Avmi: 04:15, " + 
					 "gvMwie: 05:45, " +
					 "Ckv: 07:30 " + 
					 "</html>");
			 
			 // team name
			 teamname.setText("<html>" + "</br>" +
					 "- Team Dynamic: Joty, Osru, Anika."+
					 "</html>");
			 
			 try {
				 Thread.sleep(1000);
			 }
			 catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
	 }
}

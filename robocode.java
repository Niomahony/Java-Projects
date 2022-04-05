//created by Mark, Euan and Nick
package eb;
import robocode.*;
//import java.awt.Color;


// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Test1 - a robot by (your name here)
 */

public class weThoughtAdvancedRobotWasOkToUse extends Robot
{

    boolean start = true;


    public void run() {
    	System.out.println("Nick and mark win!");
        while (start) {
        //TOP LEFT
            if (getX() < 400 && getY() > 400) {
                while(getX() > 20) {
                    turnRight(270 - getHeading());
                    ahead(getX() - 20);
                    }
                while(getY() > 400) {
                    turnRight(180 - getHeading());
                    ahead(getY() - 400);
                    }
                turnRight(180);
                turnGunRight(90);
            }
        //TOP RIGHT
            else if (getX() > 400 && getY() > 400) {
                while(getX() < 780) {
                    turnRight(90 - getHeading());
                    ahead(780 - getX());
                    }
                while(getY() > 400) {
                    turnRight(180 - getHeading());
                    ahead(getY() - 400);
                    }
                turnGunRight(90);

            }
        //BOTTOM LEFT
            else if (getX() < 400 && getY() < 400) {
                while(getX() > 20) {
                    turnRight(270 - getHeading());
                    ahead(getX() - 20);
                    }
                while(getY() < 400) {
                    turnRight(0 - getHeading());
                    ahead(400 - getY());
                    }
                turnGunRight(90);

            }
        //BOTTOM RIGHT
            else if (getX() > 400 && getY() < 400) {
                while(getX() < 780) {
                    turnRight(90 - getHeading());
                    ahead(780 - getX());
                    }
                while(getY() < 400) {
                    turnRight(0 - getHeading());
                    ahead(400 - getY());
                    }
                turnRight(180);
                turnGunRight(90);
            }
        start = false;
        }

        while(true) {

         jankMove();

        }

        }


    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e) {


		if (e.getDistance() < 200){
			fire (2);
		}else if(e.getDistance() < 150){
			fire (3);
		}else{
			fire (0.1);
		}

    }

	public void onHitRobot(HitRobotEvent e){
		reverseJank();

	}

	private void reverseJank(){
		 ahead(-100);

            ahead(-100);

            turnRight(-45);

            ahead(-282);

            turnRight(-45);

            ahead(-200);

            ahead(-200);

            turnRight(-45);

            ahead(-282);

            turnRight(-45);

            ahead(-100);

            ahead(-100);

	}

	private void jankMove(){
		 ahead(100);

            ahead(100);

            turnRight(45);

            ahead(282);

            turnRight(45);

            ahead(200);

            ahead(200);

            turnRight(45);

            ahead(282);

            turnRight(45);

            ahead(100);

            ahead(100);

	}

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    //public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like
        //back(10);
    //}

    /**
     * onHitWall: What to do when you hit a wall
     */
    //public void onHitWall(HitWallEvent e) {
        // Replace the next line with any behavior you would like
        //back(20);

    //}    
}
0 comments on commit d427df3
Please sign in to comment.

    © 2022 GitHub, Inc.

    Terms
    Privacy
    Security
    Status
    Docs
    Contact GitHub
    Pricing
    API
    Training
    Blog
    About

Loading complete

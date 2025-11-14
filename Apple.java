import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public Apple() {
        setImage("images/apple2.png");
    }

    public void act()
    {   
        move(-11);
        
        if(getX() <= 0) {
            resetApple();
        }
        
        if(isTouching(Hero.class)){
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    
    public void resetApple() {
        int number = Greenfoot.getRandomNumber(2);
        if(number == 0) {
           setLocation(600, 100); 
        } else {
            setLocation(600, 300);
        }
        
    }
}

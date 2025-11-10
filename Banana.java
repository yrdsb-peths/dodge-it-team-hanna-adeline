import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetBanana();
        }
        
        if(isTouching(Hero.class)){
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    
    public void resetBanana() {
        int number = Greenfoot.getRandomNumber(2);
        if(number == 0) {
           setLocation(600, 100); 
        } else {
            setLocation(600, 300);
        }
        
    }
}

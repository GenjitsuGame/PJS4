package com.gamefactory.components;

import java.awt.Color;
import java.awt.Graphics;

import com.gamefactory.displayable.Component;
import com.gamefactory.displayable.ComponentManager;

public class Collider extends Component {

    @Override
    public void init(ComponentManager owner) {
        super.init(owner);
        position = (Position) owner.getComponent(Position.class);
    }

    @Override
    public void update() {
    }
    

    /**
     * Taille de rectangle
     */
    private int width;
    private int height;
    
    /**
     * Position du GameObject
     */
    private Position position;
    
   
    public Collider() {
    	width = 20;
    	height = 20;
    }

    public void render(Graphics g) {
    	g.setColor(Color.red);
    	g.drawRect ((int)position.getX(), (int)position.getY(), width, height);  
    }
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public int getX() {
    	return (int) position.getX();
    }
    
    public int getY() {
    	return (int) position.getY();
    }
    
    public void detectCollision() {
    	
    }
    


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamefactory.scripts;

import com.gamefactory.displayable.LoadingScript;
import com.gamefactory.displayable.Landscape;
import com.gamefactory.displayable.Scene;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author ngo
 */
public class LandscapeHorizontalScript extends LoadingScript<Scene> {
    
    private Landscape landscapeHorizontal;
    private BufferedImage image;
    
    @Override
    public void executeOnce() {
        try {
            image = ImageIO.read(new File("landscapeHorizontal.png"));
        } catch (Exception e) {
            System.out.println("e");
        }
    }
    
    @Override
    public void load() {
        this.landscapeHorizontal = this.owner.getOwner().getLandscape();
    }
    
}

package com.company.TileMap;

import java.awt.image.BufferedImage;
/*! \class BlockedTile
    \brief Clasa care descrie Tile-ul BLOCKED
 */
public class BlockedTile extends Tile {

    /*! \fn public BlockedTile(BufferedImage image)
        \brief Contructorul clasei
     */
    public BlockedTile(BufferedImage image)
    {
        super(image,1);
    }

    /*! \fn public BufferedImage getImage()
        \brief Returneaza imaginea Tile-ului
     */
    public BufferedImage getImage()
    {
        return super.image;
    }

    /*! \fn public int getType()
        \brief Returneaza tipul Tile-ului
     */
    public int getType()
    {
        return type;
    }

    /*! \fn public void setType(int type)
        \brief Seteaza tipul
     */
    public void setType(int type)
    {
        this.type = type;
    }
}

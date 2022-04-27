package snakeladder.game;

import ch.aplu.jgamegrid.Actor;
import java.util.ArrayList;

public class Die extends Actor
{
  private NavigationPane np;
  private int nb;
  private int sumOfRolls;

  Die(int nb, NavigationPane np, int sumOfRolls)
  {
    super("sprites/pips" + nb + ".gif", 7);
    this.nb = nb;
    this.np = np;
    this.sumOfRolls = sumOfRolls;
  }

  public void act()
  {
    showNextSprite();
    if (getIdVisible() == 6)
    {
      setActEnabled(false);
      np.startMoving(sumOfRolls);
    }
  }


}
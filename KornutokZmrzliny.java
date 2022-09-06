package uloha5_kornutokZmrzliny;

/**
 * trieda KornutokZmrzliny
 */
public class KornutokZmrzliny {

    public double objem;
    public double povrch;

    /**
     * vytvara novy kornutok
     */
    public KornutokZmrzliny()
  {
      objem = 0;
      povrch = 0;
  }

    /**
     * pocita objem kornutka
      * @param polomer je polomer kornutka
     * @param vyska je vyska kornutka
     */
  public void ObjemKurnutka(int polomer, int vyska)
   {
          objem = (Math.PI * (polomer * polomer) * vyska) / 3;

   }

    /**
     * vracia objem kornutka
     * @return objem
     */
   public double getObjem()
   {
       return objem;
   }

    /**
     *  pocita povrch kornutka
     * @param polomer je polomer kornutka
     * @param vyska je vyska kornutka
     */
   public void  PovrchKornutka(int polomer, int vyska)
   {
       int a = (polomer * polomer) + (vyska * vyska);
       double polomerPlasta = Math.sqrt(a);
       povrch = Math.PI * polomer * polomerPlasta;
   }

    /**
     * vracia porch kornutka
     * @return povrch
     */
   public double getPovrch()
    {
        return povrch;
    }

}

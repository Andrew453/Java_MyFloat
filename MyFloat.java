package com.company;

public class MyFloat {
    private long mantissa;
    private long exponent;
    private long resultexponent;
    private long resultmantissa;

    public MyFloat(long mantissa, long exponent)
    {
        this.mantissa=mantissa;
        this.exponent = exponent;
    }

    
}
/*

        fractlength1 = 0;
        fractlength2 = 0;
        while(this.myFraction/(long)(Math.pow(10,fractlength1))!=0)
        {
            fractlength1++;
        }
        while(b.myFraction/(long)(Math.pow(10,fractlength2))!=0)
        {
            fractlength2++;
        }
        this.myInteger=this.myInteger*(long)(Math.pow(10,fractlength1));
        b.myInteger = b.myInteger *(long)(Math.pow(10,fractlength2));
        b.myInteger+=b.myFraction;
        this.myInteger+=this.myFraction;
        if(fractlength1>=fractlength2)
        {
            this.resultExp=fractlength1;
            b.myInteger = b.myInteger*(long)(Math.pow(10,(fractlength1-fractlength2)));
        }
        else
        {
            this.resultExp = fractlength2;
            this.myInteger = this.myInteger *(long)(Math.pow(10,(fractlength2-fractlength1)));
        }
        number = b.myInteger+this.myInteger;
        this.resultInteger = (long)(this.number/Math.pow(10, this.resultExp));
        this.resultFraction = (long)(this.number%Math.pow(10, this.resultExp));
        System.out.println(this.resultInteger+","+this.resultFraction);

 */
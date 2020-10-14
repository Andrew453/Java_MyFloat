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
    public void sum(MyFloat b)
    {
        if(b.exponent>=this.exponent){
            for(int i=0;i<b.exponent-this.exponent;i++)
                this.mantissa*=10;
            this.resultexponent=b.exponent;
        }
        else{
            for(int j=0;j<this.exponent-b.exponent;j++)
                b.mantissa*=10;
            this.resultexponent=this.exponent;
        }
        this.resultmantissa=b.mantissa+this.mantissa;


        long before =this.resultmantissa/(long)(Math.pow(10, this.resultexponent));
        long after = this.resultmantissa%(long)(Math.pow(10, this.resultexponent));
        long afternum=0;
        long checkafter=after;
        while(checkafter!=0)
        {
            checkafter/=10;
            afternum++;
        }
        String afteranswer = Long.toString(after);
        if(this.resultexponent!=afternum)
        {
            for(int i=0;i<(this.resultexponent-afternum);i++)
                afteranswer = "0"+ afteranswer;
        }
        String beforeanswer = Long.toString(before);
        String answer = beforeanswer + "," + afteranswer;
        System.out.println(answer);


    }


    public void sub(MyFloat b)
    {
        if(b.exponent >= this.exponent){
            for(int i = 0; i < b.exponent-this.exponent; i++)
                this.mantissa *= 10;
            this.resultexponent = b.exponent;
        }
        else{
            for(int j = 0; j<this.exponent - b.exponent; j++)
                b.mantissa *= 10;
            this.resultexponent = this.exponent;
        }
        this.resultmantissa = this.mantissa - b.mantissa;
        boolean minus = false;
        if(this.resultmantissa < 0)
        {
            this.resultmantissa *= (-1);
            minus = true;
        }
        long before = this.resultmantissa / (long)(Math.pow(10,this.resultexponent));
        long after = this.resultmantissa % (long)(Math.pow(10,this.resultexponent));
        long afterCheck = after;
        long afternum = 0;
        while (afterCheck != 0)
        {
            afternum++;
            afterCheck /= 10;
        }
        String afteranswer = Long.toString(after);
        if(resultexponent != afternum)
        {
            for(int i = 0;i < resultexponent - afternum; i++)
            {
                afteranswer = "0" + afteranswer;
            }
        }
        String beforeanswer = Long.toString(before);
        String answer = beforeanswer + "," + afteranswer;
        if(minus)
            answer = "-"+answer;
        System.out.println(answer);
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
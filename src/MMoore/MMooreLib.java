package MMoore;

public class MMooreLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    }
    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        int init1=0;
        int init2=0;
        int init3=0;
        int checkpoint=1;
        int equivChecker=0;
        int equivChecker2=0;

        if (num1==num2 && num2==num3)
        {
            return(num1);
        }
        for (int i=1; checkpoint!=2;i++)
        {
            if (num1<num2 && num1<num3)
            {
                init1=num1*i;
                if (init1==num2)
                {
                    checkpoint+=1;
                    equivChecker=init1;
                }
                if (init1==num3)
                {
                    checkpoint+=1;
                    equivChecker2=init1;
                }
            }
            if (num2<num1 && num2<num3)
            {
                init1=num2*i;
                if (init1==num1)
                {
                    checkpoint+=1;
                    equivChecker=init1;
                }
                if (init1==num3)
                {
                    checkpoint+=1;
                    equivChecker2=init1;
                }
            }
            if (num3<num2 && num3<num1)
            {
                init1=num3*i;
                if (init1==num2)
                {
                    checkpoint+=1;
                    equivChecker=init1;
                }
                if (init1==num1)
                {
                    checkpoint+=1;
                    equivChecker2=init1;
                }
            }
        }
        if (equivChecker==equivChecker2)
        {

        }
        return()

    }
}

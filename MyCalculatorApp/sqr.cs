using System.Linq.Expressions;

public class Squareroot : Calculation
{
    public Squareroot(double start, double end = 0) : base(start, end) { }
    public override double Operatio()
    {
        // if (start < 0)
        // {
        //     Console.WriteLine("squerroot cant be negative");
        //     return double.NaN;

        // }
        if (start < 0)
        {
            throw new ArgumentOutOfRangeException(nameof(start), "Square root can't be negative.");
        }

        return Math.Sqrt(start);

    }

}

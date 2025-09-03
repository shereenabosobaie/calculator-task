using System;
using System.ComponentModel.DataAnnotations;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Calculation add = new Addition(5, 3);
            Console.WriteLine($"addition of 5+3: {add.Operatio(add.start, add.end)}");
            Calculation sub = new Subtractio(5, 3);
            Console.WriteLine($"Subtraction of 5-3: {sub.Operatio(sub.start, sub.end)}");
            Calculation div = new Division(5, 3);
            Console.WriteLine($"Division of 5/3: {div.Operatio(div.start, div.end)}");
            Calculation mul = new Multi(5, 3);
            Console.WriteLine($"Multiplication of 5*3: {mul.Operatio(mul.start, mul.end)}");
            Calculation sr = new Squareroot(5);
            Console.WriteLine($"Square root of 5: {sr.Operatio(sr.start)}");
            Calculation mod = new Mode(5, 3);
            Console.WriteLine($"modulo of 5%3: {mod.Operatio(mod.start, mod.end)}");
            Calculation pow = new Power(5, 3);
            Console.WriteLine($"Power of 5^3: {pow.Operatio(pow.start, pow.end)}");

            // Calculation divv = new Division(5, 0);
            // Console.WriteLine( divv.Operatio(divv.start, divv.end));
            // Calculation srr = new Squareroot(-1);
            // Console.WriteLine( srr.Operatio(srr.start));
            // Calculation modd = new Mode(5, 0);
            // Console.WriteLine(modd.Operatio(modd.start, modd.end));

        }
    }
    public abstract class Calculation
    {
        public double start;
        public double end;
        public Calculation(double start=0, double end=0)
        {
            this.start = start;
            this.end = end;
        }
        public abstract double Operatio(double start, double end=0);
    }
    public class Addition : Calculation
    {
        public Addition(double start, double end) : base(start, end)
        {
        }
        public override double Operatio(double start, double end)
        {
            return start + end;
        }
    }
    public class Subtractio : Calculation
    {
        public Subtractio(double start, int end) : base(start, end)
        {
        }
        public override double Operatio(double start, double end)
        {
            return start - end;
        }

    }
    public class Multi : Calculation
    {
        public Multi(double start, double end) : base(start, end)
        { }
        public override double Operatio(double start, double end)
        {
            return start * end;
        }

    }
    public class Division : Calculation
    {
        public Division(double start, double end) : base(start, end)
        { }
        public override double Operatio(double start, double end)
        {
            if (end == 0.0)
            {
                throw new DivideByZeroException("Cannot divide by zero");
            }
            return start / end;
        }
    }
    public class Power : Calculation
    {
        public Power(double start, double end) : base(start, end)
        { }
        public override double Operatio(double start, double end)
        {
            return Math.Pow(start, end);
        }

    }
    public class Mode : Calculation
    {
        public Mode(double start, double end) : base(start, end)
        { }
        public override double Operatio(double start, double end)
        {
            if (end == 0.0)
            {
                throw new DivideByZeroException("Cannot divide by zero");
            }
            return start % end;
        }

    }
    public class Squareroot : Calculation
    {
        public Squareroot(double start, double end=0) : base(start, end) { }
        public override double Operatio(double start, double end=0)
        {
            if (start < 0)
            {
                throw new ArgumentOutOfRangeException("squerroot cant be negative");
            }
            return Math.Sqrt(start);
            
        }

    }
    
}

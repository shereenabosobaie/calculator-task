using System;
using System.ComponentModel.DataAnnotations;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Select the operation from the following list:");
                Console.WriteLine("1 for addition");
                Console.WriteLine("2 for Subtraction");
                Console.WriteLine("3 for Multiplication");
                Console.WriteLine("4 for Division");
                Console.WriteLine("5 for Square root");
                Console.WriteLine("6 for Modulo");
                Console.WriteLine("7 for Power");
                Console.WriteLine("8 to Exit");
                double operation = Convert.ToDouble(Console.ReadLine());
                if (operation == 8)
                {
                    break;
                }
                Console.WriteLine("Enter first number: ");
                double num1 = Convert.ToDouble(Console.ReadLine());
                double num2 = 0;
                if (operation != 5)
                {
                    Console.WriteLine("Enter second number: ");
                    num2 = Convert.ToDouble(Console.ReadLine());
                }
                switch (operation)
                {
                    case 1:
                        Calculation add = new Addition(num1, num2);
                        Console.WriteLine("Result of addition:" + add.Operatio(add.start, add.end));
                        break;
                    case 2:
                        Calculation sub = new Subtractio(num1, num2);
                        Console.WriteLine("Result of Subtraction:" + sub.Operatio(sub.start, sub.end));
                        break;
                    case 3:
                        Calculation mul = new Multi(num1, num2);
                        Console.WriteLine("Result of Multiplication:" + mul.Operatio(mul.start, mul.end));
                        break;
                    case 4:
                        Calculation div = new Division(num1, num2);
                        Console.WriteLine("Result of Division:" + div.Operatio(div.start, div.end));
                        break;
                    case 5:
                        Calculation sr = new Squareroot(num1);
                        Console.WriteLine("Result of Square root:" + sr.Operatio(sr.start));
                        break;
                    case 6:
                        Calculation mod = new Mode(num1, num2);
                        Console.WriteLine("Result of Modulo:" + mod.Operatio(mod.start, mod.end));
                        break;
                    case 7:
                        Calculation pow = new Power(num1, num2);
                        Console.WriteLine("Result of Power:" + pow.Operatio(pow.start, pow.end));
                        break;
                }
                Console.WriteLine();
            }
        }
    }
    public abstract class Calculation
    {
        public double start;
        public double end;
        public Calculation(double start = 0, double end = 0)
        {
            this.start = start;
            this.end = end;
        }
        public abstract double Operatio(double start, double end = 0);
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
        public Subtractio(double start, double end) : base(start, end)
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
        public Squareroot(double start, double end = 0) : base(start, end) { }
        public override double Operatio(double start, double end = 0)
        {
            if (start < 0)
            {
                throw new ArgumentOutOfRangeException("squerroot cant be negative");
            }
            return Math.Sqrt(start);

        }

    }

}

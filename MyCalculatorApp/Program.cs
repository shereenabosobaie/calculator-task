using System;
using System.ComponentModel.DataAnnotations;
using System.Security.Cryptography.X509Certificates;

namespace MyApp
{
    internal class Program
    {
        public static void choose()
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
        }
        static void Main(string[] args)
        {


            while (true)
            {
                choose();
                if (!int.TryParse(Console.ReadLine(), out int operation) || operation < 1 || operation > 8)
                {
                    Console.WriteLine("Invalid input, please enter a number from 1 to 8");
                    continue;
                }

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
                Calculation? cal = (operation) switch
                {
                    1 => new Addition(num1, num2),
                    2 => new Subtractio(num1, num2),
                    3 => new Multi(num1, num2),
                    4 => new Division(num1, num2),
                    5 => new Squareroot(num1),
                    6 => new Mode(num1, num2),
                    7 => new Power(num1, num2),
                    _ => null
                };

                Console.WriteLine("Result of the oporation: " + cal.Operatio());

                Console.WriteLine();
            }

        }
    }
}


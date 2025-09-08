using System;
using System.ComponentModel.DataAnnotations;
using System.Reflection;
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
                if (!double.TryParse(Console.ReadLine(), out double num1))
                {
                    Console.WriteLine("Invalid input. Please enter a valid number.");
                    continue;
                }
                double num2 = 0;
                if (operation != 5)
                {
                    Console.WriteLine("Enter second number: ");
                    if (!double.TryParse(Console.ReadLine(), out num2))
                    {
                        Console.WriteLine(" Invalid input. Please enter a valid number.");
                        continue;
                    }
                    ;
                }

                Calculation cal = (operation) switch
                {
                    1 => new Addition(num1, num2),
                    2 => new Subtractio(num1, num2),
                    3 => new Multi(num1, num2),
                    4 => new Division(num1, num2),
                    5 => new Squareroot(num1),
                    6 => new Mode(num1, num2),
                    7 => new Power(num1, num2),
                };

                try
                {
                    double result = cal.Operatio();
                    Console.WriteLine("Result of the operation: " + result);
                }
                catch (DivideByZeroException ex)
                {
                    Console.WriteLine("Error: " + ex.Message);
                    continue;
                }
                catch (ArgumentOutOfRangeException ex)
                {
                    Console.WriteLine("Error: " + ex.Message);
                    continue;
                }

                Console.WriteLine();
            }

        }
    }
}


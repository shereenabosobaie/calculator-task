public class Division : Calculation
    {
        public Division(double start, double end) : base(start, end)
        { }
        public override double Operatio()
        {
        if (end == 0.0)
        {
           
                Console.WriteLine("Division by zero is not allowed.");
                return double.NaN;
            
        }
            return start / end;
        }
    }

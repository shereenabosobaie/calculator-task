public class Power : Calculation
    {
        public Power(double start, double end) : base(start, end)
        { }
        public override double Operatio()
        {
            return Math.Pow(start, end);
        }

    }
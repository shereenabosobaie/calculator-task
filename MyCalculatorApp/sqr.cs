public class Squareroot : Calculation
    {
        public Squareroot(double start, double end = 0) : base(start, end) { }
        public override double Operatio()
        {
            if (start < 0)
            {
                throw new ArgumentOutOfRangeException("squerroot cant be negative");
            }
            return Math.Sqrt(start);

        }

    }

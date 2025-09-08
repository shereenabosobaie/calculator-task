public class Mode : Calculation
    {
        public Mode(double start, double end) : base(start, end)
        { }
        public override double Operatio()
        {
            if (end == 0.0)
            {
                throw new DivideByZeroException("Cannot divide by zero");
            }
            return start % end;
        }

    }
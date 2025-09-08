public class Addition : Calculation
    {
        public Addition(double start, double end) : base(start, end)
        {
        }
        public override double Operatio()
        {
            return start + end;
        }
    }
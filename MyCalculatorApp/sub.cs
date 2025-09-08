 public class Subtractio : Calculation
    {
        public Subtractio(double start, double end) : base(start, end)
        {
        }
        public override double Operatio()
        {
            return start - end;
        }

    }
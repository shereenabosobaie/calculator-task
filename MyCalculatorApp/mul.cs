  public class Multi : Calculation
    {
        public Multi(double start, double end) : base(start, end)
        { }
        public override double Operatio()
        {
            return start * end;
        }

    }
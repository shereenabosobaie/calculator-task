public abstract class Calculation
    {
        public double start;
        public double end;
        public Calculation(double start = 0, double end = 0)
        {
            this.start = start;
            this.end = end;
        }
        public abstract double Operatio();
    }
public class Bet2 {
        private int bet;
        private int risk;

        public Bet2(int bet, int risk) {
            this.bet = bet;
            this.risk = risk;
        }

        public void SetBet(int bet) {
            this.bet = bet;
        }

        public void SetRisk(int risk) {
            this.risk = risk;
        }

        public int getBet() {
            return bet;
        }

        public int getRisk() {
            return risk;
        }
}

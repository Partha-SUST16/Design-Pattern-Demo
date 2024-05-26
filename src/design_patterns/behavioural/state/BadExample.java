package design_patterns.behavioural.state;

public class BadExample {
    class Document {
        private String state;

        public Document() {
            state = "draft";
        }

        public void publish() {
            switch (state) {
                case "draft":
                    moveToModeration();
                    break;
                case "moderation":
                    approveForPublication();
                    break;
                case "published":
                    break;

            }
        }

        private void moveToModeration() {
            state = "moderation";
            System.out.println("Document moved to moderation status.");
        }

        private void approveForPublication() {
            state = "published";
            System.out.println("Document approved for publishable status.");
        }
    }
}

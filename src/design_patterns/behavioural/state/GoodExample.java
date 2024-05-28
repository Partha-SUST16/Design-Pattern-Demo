package design_patterns.behavioural.state;

public class GoodExample {
    interface DocumentState {
        void publish(Document document);
    }

    static class DraftState implements DocumentState {
        @Override
        public void publish(Document document) {
            System.out.println("Document moved to moderation status.");
            document.setState(new ModerationState());
        }
    }

    static class ModerationState implements DocumentState {
        @Override
        public void publish(Document document) {
            System.out.println("Document approved for publishable status.");
            document.setState(new MState2());
        }
    }

    static class MState2 implements DocumentState {
        @Override
        public void publish(Document document) {
            System.out.println("Document approved for publishable status.");
            document.setState(new PublishedState());
        }
    }

    static class PublishedState implements DocumentState {
        @Override
        public void publish(Document document) {
            System.out.println("The document has already been published.");
        }
    }

     static class Document {
        private DocumentState state;

        public Document() {
            this.state = new DraftState();
        }

        public void publish() {
            state.publish(this);
        }

        public void setState(DocumentState state) {
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Document document = new Document();
        document.publish();
        document.setState(new ModerationState());
        document.publish();
    }
}

/**
 * 1. Modularity
 * 2. Flexibility and Extensibility
 * 3. Code duplication prevention
 * 4. Clear code Understanding
 * 5. Ease of transition
 */
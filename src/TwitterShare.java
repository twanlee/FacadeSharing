public class TwitterShare implements SocialShare {
    private String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Share to Twitter: " + message);
    }
}

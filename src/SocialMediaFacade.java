public class SocialMediaFacade {
    private FaceBookShare faceBookShare;
    private TwitterShare twitterShare;
    public SocialMediaFacade(FaceBookShare faceBookShare,TwitterShare twitterShare){
        this.faceBookShare = faceBookShare;
        this.twitterShare = twitterShare;
    }
    public void shareMes(String message){
        this.faceBookShare.setMessage(message);
        this.twitterShare.setMessage(message);
        this.twitterShare.share();
        this.faceBookShare.share();
    }
}

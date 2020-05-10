public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new FaceBookShare(), new TwitterShare());
        socialMediaFacade.shareMes(message);
    }
}

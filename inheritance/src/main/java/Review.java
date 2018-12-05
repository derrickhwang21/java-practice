public class Review {
    private String body;
    private String author;
    private int stars;

    public Review(String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String getBody(){
        return this.body;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getStars(){
        return this.stars;
    }

    public String toString(){
        String str = "Body: " + this.body + " Author: " +this.author + " Stars: " + this.stars;
        return str;
    }



}

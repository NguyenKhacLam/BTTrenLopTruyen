package com.example.btbuoi8.modals;

public class Story {
    private String name;
    private int image;
    private String author;
    private int chapter;
    private String categories;
    private boolean status;
    private String uploadDate;
    private String updateAt;
    private String content = "Trong Solo Leveling, Ber (một số bản dịch khác vẫn giữ nguyên cách gọi Ant King) là quái thú được sinh ra trực tiếp bởi nữ hoàng kiến trên đảo Jeju. Với sức mạnh kinh khủng của mình, Ber hạ gục được gần như toàn bộ hội quán mạnh nhất ở Nhật Bản mà không hề tốn chút sức lực nào. Ngay cả những thợ săn cấp S hàng đầu của quốc gia này cũng lần lượt ngã xuống khi phải đối diện với Ber mà không thể phản kháng dù chỉ một đòn.Tính đến nay, đây là quái vật thứ ba có thể giao tiếp với Jinwoo và được xếp và cấp chỉ huy. Ngay từ khi được sinh ra bởi kiến chúa, với bản tính thú săn mồi của mình, một khi rơi vào cơn khát máu Ber thậm chí còn chẳng bận tâm đến mệnh lệnh của cấp trên mà chỉ tập trung vào một mục tiêu duy nhất là con mồi. Chính vì lý do đó Ber được xem là một trong những phản diện mạnh nhất phần đầu của bộ truyện.Đến Season 2 sau khi bị chiết xuất bởi Jinwoo và trở thành binh lính bóng tối cấp chỉ huy phục vụ dưới trướng anh chàng này, Ber đã không còn ngầu như chúng ta vẫn nghĩ. Cụ thể khi Cha Hea In tìm đến hội quán của Jinwoo và đề nghị gia nhập hội, cô đã buộc phải tham gia thử thách đối đầu với binh lính bóng tối mạnh nhất của anh chàng, vua của loài kiến.\n" +
            "\n" +
            "Gạt bỏ nổi sợ hãi sau sự kiện đảo Jeju, Cha Hea In đã can đảm đối diện với Ber thêm một lần nữa. Mặc dù không còn bất ngờ như trước và có thể chống trả nhiều lần trước đợt tấn công của quái vật. Thế nhưng Cha Hea In vẫn bị áp đảo hoàn toàn trước sức mạnh của Ber. Không kìm được cơn khát máu của mình, kiến vương nhất quyết hạ sát khi cả khi nhận được lệnh dừng cuộc chiến từ phía Jinwoo. Kết quả là Beru phải chịu trận khi lỡ đụng vào người yêu tương lai của chủ nhân mình.";

    public Story() {
    }

    public Story(String name, int image, String author, int chapter, String categories, boolean status, String uploadDate, String updateAt) {
        this.name = name;
        this.image = image;
        this.author = author;
        this.chapter = chapter;
        this.categories = categories;
        this.status = status;
        this.uploadDate = uploadDate;
        this.updateAt = updateAt;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAuthor() {
        return author;
    }

    public int getChapter() {
        return chapter;
    }

    public String getCategories() {
        return categories;
    }

    public boolean isStatus() {
        return status;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}

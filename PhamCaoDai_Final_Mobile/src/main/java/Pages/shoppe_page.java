package Pages;

import org.openqa.selenium.By;

public class shoppe_page {
    public By btn_trai_nghiem = By.id("com.nct.shopiness:id/btn_trai_nghiem");

    public By permission = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");

    public By cartIcon = By.id("com.nct.shopiness:id/icn_giohang");

    public By searchIcon = By.id("com.nct.shopiness:id/menu_item_search");
    public By btn_try = By.id("com.nct.shopiness:id/btn_try_cash_back");

    public By hoanTien = By.xpath("(//android.widget.TextView[@text=\"Hoàn tiền\"]");

    public By ThuongHieu = By.xpath("(//android.widget.TextView[@text=\"Thương hiệu\"]");

    public By UuDai = By.xpath("(//android.widget.TextView[@text=\"Ưu đãi\"]");

    public By voucher = By.xpath("(//android.widget.TextView[@text=\"Voucher\"]");

    public By caNhan = By.xpath("(//android.widget.TextView[@text=\"Cá nhân\"]");

    public By muaSamOl = By.xpath("(//android.widget.TextView[@text=\\\"Mua Sắm\\n\" +\n" +
            "            \"Online\\\"]");

    public By shopee = By.xpath("(//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/iv_brand_logo\"])[1]");

    public By lazada = By.xpath("((//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/iv_brand_logo\"])[2]");

    public By tiki = By.xpath("((//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/iv_brand_logo\"])[3]");

    public By aeon = By.xpath("(((//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/iv_brand_logo\"])[4]");

    public By UuDai1 = By.xpath("//android.widget.TextView[@text=\"Ưu đãi\"]");

    public By firstItem = By.xpath("(//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/imageView_deal\"])[1]");

    public By DiscountImage = By.id("com.nct.shopiness:id/deal_image_view");

    public By Description = By.id("com.nct.shopiness:id/rating_criteria_text_view");

    public By DanhMucHoanTien = By.xpath("//android.widget.Button[@text=\"DANH MỤC HOÀN TIỀN\n" +
            "MÃ ƯU ĐÃI\"]");

//    public By Voucher = By.xpath("(//android.widget.TextView[@text=\"Voucher\"]");

    public By lastVoucher = By.xpath("((//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/ivProduct\"])[4]");

    public By VoucherImage = By.id("com.nct.shopiness:id/imgView");

    public By VoucherDescription = By.id("com.nct.shopiness:id/tv_description");

    public By MuaNgayButton = By.xpath("//android.widget.Button[@text=\"MUA NGAY\n" +
            "Còn (999)\"]");
    public By AddCartIcon = By.xpath("//android.widget.LinearLayout[@resource-id=\"com.nct.shopiness:id/llt_redeem_button\"]/android.widget.Button[2]");

    public By MaUuDai = By.xpath("//android.widget.TextView[@text=\"Mã ưu đãi\"]");

    public By UuDai2 = By.xpath("//android.widget.TextView[@text=\"Ưu đãi\"])[1]");

    public By Voucher2 = By.xpath("//android.widget.TextView[@text=\"Voucher\"])[1]");

    public By thuongHieu2 = By.xpath("//android.widget.TextView[@text=\"Thương hiệu\"])[1]");




}

package Functions;

import Pages.shoppe_page;

import javax.swing.plaf.PanelUI;
import java.io.IOException;

public class shoppe_function {
    common commonFunction = new common();
    shoppe_page shoppePage = new shoppe_page();

    public void clickToBatDau() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.clickToElement(shoppePage.btn_trai_nghiem);
    }

    public void clickToDeny() {
        commonFunction.clickToElement(shoppePage.permission);
    }

    public void verifyHomeScreen() {
        commonFunction.isdisplayed(shoppePage.cartIcon);
        commonFunction.isdisplayed(shoppePage.searchIcon);
        commonFunction.isdisplayed(shoppePage.btn_try);
    }

    public void verifyMenu() {
        commonFunction.isdisplayed(shoppePage.hoanTien);
        commonFunction.isdisplayed(shoppePage.ThuongHieu);
        commonFunction.isdisplayed(shoppePage.UuDai);
        commonFunction.isdisplayed(shoppePage.voucher);
        commonFunction.isdisplayed(shoppePage.caNhan);
    }

    public void clickToThuongHieu() {
        commonFunction.clickToElement(shoppePage.muaSamOl);
        commonFunction.clickToElement(shoppePage.ThuongHieu);
    }

    public void verify4BranchName(){
        commonFunction.isdisplayed(shoppePage.shopee);
        commonFunction.isdisplayed(shoppePage.lazada);
        commonFunction.isdisplayed(shoppePage.tiki);
        commonFunction.isdisplayed(shoppePage.aeon);
    }
    public void clickToMuaSamOl(){
        commonFunction.clickToElement(shoppePage.muaSamOl);
    }
    public void clickToUuDai(){
        commonFunction.clickToElement(shoppePage.UuDai1);
    }

    public void clickFirstItem(){
        commonFunction.clickToElement(shoppePage.firstItem);
    }

    public void verifySomeItem(){
        commonFunction.isdisplayed(shoppePage.DiscountImage);
        commonFunction.isdisplayed(shoppePage.Description);
        commonFunction.isdisplayed(shoppePage.DanhMucHoanTien);
    }

    public void clickToVoucher(){
        commonFunction.clickToElement(shoppePage.voucher);
    }

    public void SwipeAndClickToTheLastVoucher() throws IOException {
        commonFunction.checkScrollToElement(shoppePage.lastVoucher);
    }

    public void verifySome4Item(){
        commonFunction.isdisplayed(shoppePage.VoucherImage);
        commonFunction.isdisplayed(shoppePage.VoucherDescription);
        commonFunction.isdisplayed(shoppePage.MuaNgayButton);
        commonFunction.isdisplayed(shoppePage.AddCartIcon);
    }

    public void clickToCaNhan(){
        commonFunction.clickToElement(shoppePage.caNhan);
    }

    public void verify4tab(){
        commonFunction.isdisplayed(shoppePage.MaUuDai);
        commonFunction.isdisplayed(shoppePage.UuDai2);
        commonFunction.isdisplayed(shoppePage.Voucher2);
        commonFunction.isdisplayed(shoppePage.thuongHieu2);
    }
}
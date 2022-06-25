package com.bajie.uvccamera.rtmplive;

import com.serenegiant.usb.USBMonitor;
import com.youngwu.live.UVCPublisher;

public class OpenCameraEntity {
    private USBMonitor.UsbControlBlock ctrlBlock;
    private UVCPublisher publisher;
    private String url;

    public USBMonitor.UsbControlBlock getCtrlBlock() {
        return ctrlBlock;
    }

    public void setCtrlBlock(USBMonitor.UsbControlBlock ctrlBlock) {
        this.ctrlBlock = ctrlBlock;
    }

    public UVCPublisher getPublisher() {
        return publisher;
    }

    public void setPublisher(UVCPublisher publisher) {
        this.publisher = publisher;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
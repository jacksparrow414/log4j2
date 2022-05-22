package com.example.log4j2.uml;

/**
 * @author jacksparrow414
 * @date 2022/5/22
 */
public class Male extends Human{
    
    private Long moustache;
    
    public Foot foot;
    
    public Hand hand;
    
    @Override
    Float height() {
        return null;
    }
    
    @Override
    Float weight() {
        return null;
    }
    
    @Override
    Integer age() {
        return null;
    }
    
    @Override
    String name() {
        return null;
    }
    
    @Override
    public String getGender() {
        return "male";
    }
   
    
    public Long getMoustache() {
        return moustache;
    }
    
    public void setMoustache(final Long moustache) {
        this.moustache = moustache;
    }
}

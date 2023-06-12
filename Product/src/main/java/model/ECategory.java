package model;

public enum ECategory {
   VIP(1,"Vip"),
    SUPERVIP(2,"Super Vip");

   private long id;
   private String name;

   ECategory(long id, String name){
       this.id = id;
       this.name = name;
   }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ECategory findById(long id) {
        for (ECategory e : ECategory.values()) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public static ECategory find(String type) {
        for (ECategory e : ECategory.values()) {
            if (e.toString().equals(type)) {
                return e;
            }
        }
        return null;
    }
}







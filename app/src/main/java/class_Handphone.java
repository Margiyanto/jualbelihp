class Handphone {
    private Integer id;
    private String nama;
    private String harga;
    public Handphone() {
        super();    }
        public Handphone(Integer id, String nama, String harga    )
        {        super();
        this.id = id;
        this.nama = nama;
        this.harga = harga;    }
        public Integer getId()
        {        return id;    }
        public void setId(Integer id)
        {        this.id = id;    }
        public String getName()
        {        return nama;    }
        public void setName(String name)
        {        this.nama = name;    }
        public String getHargaa()
        {        return harga;    }
        public void setHarga(String harga)
        {        this.harga = harga;    }
}


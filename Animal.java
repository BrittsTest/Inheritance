public abstract class Animal{

    private String color;
    private int age;
    private String name;
    private String limbs;
    private String sound;

	//default
    public Animal(){
        super();
    }

    public Animal(String color, int age){
        this.color = color;
        this.age = age;
    }

    public Animal(int age, String color, String sound){
        this(color, age);
        this.sound = sound;
    }
	//getter
	public String getColor(){
		return color;
	}

	//setter
	public void setColor(String color){
		this.color = color;
	}

	//getter
	public int getAge(){
		return this.age;
	}


	//setter
	public void setAge(int sAge){
		this.age = sAge;
	}

	//getter
	public String getName(){
		return name;
	}

	//setter
	public void setName(String name){
		this.name = name;
	}

	public String getLimbs(){
		return limbs;
	}

	public void setLimbs(String limbs){
		this.limbs = limbs;
	}

	public String getSound(){
		return sound;
	}

	public void setSound(String sound){
		this.sound = sound;
	}


    public void sound(){
		System.out.println("I am some arbitrary sound");
	}

	public abstract void swimming();

    public void sound(String sound){
		this.sound();
        System.out.println(getSound());
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((limbs == null) ? 0 : limbs.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sound == null) ? 0 : sound.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (limbs == null) {
			if (other.limbs != null)
				return false;
		} else if (!limbs.equals(other.limbs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sound == null) {
			if (other.sound != null)
				return false;
		} else if (!sound.equals(other.sound))
			return false;
		return true;
	}



    
    
}

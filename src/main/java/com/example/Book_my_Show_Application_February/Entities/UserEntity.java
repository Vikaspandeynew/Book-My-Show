package com.example.Book_my_Show_Application_February.Entities;


import javax.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<TicketEntity> getBookedTickets() {
		return bookedTickets;
	}

	public void setBookedTickets(List<TicketEntity> bookedTickets) {
		this.bookedTickets = bookedTickets;
	}

	public UserEntity() {
		super();
	}

	public UserEntity(int id, String name, int age, String email, @NonNull String mobNo, String address,
			List<TicketEntity> bookedTickets) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobNo = mobNo;
		this.address = address;
		this.bookedTickets = bookedTickets;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;


    @Column(unique = true,nullable = false)
    private String email;

    @NonNull
    @Column(unique = true)
    private String mobNo;

    private String address;

    @OneToMany(mappedBy = "userEntity",cascade = CascadeType.ALL)
    private List<TicketEntity> bookedTickets = new ArrayList<>();

}

/*
 * package com.example.demo.model;
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.NamedQuery; import
 * javax.persistence.Table;
 * 
 * @Entity
 * 
 * @NamedQuery(name="PokemonData.findAll",
 * query="SELECT pkmst FROM PK_POKEDEX_MST pkmst") public class
 * PokemonData_JoinTbl implements Serializable { private static final long
 * serialVersionUID = 1L;
 * 
 *//** ポケモンID */
/*
 * @Id private int pokemonId;
 * 
 *//** ポケモン日本語名 */
/*
 * private String pokemonJpName;
 * 
 *//** ポケモン英語名 */
/*
 * private String pokemonEnName;
 * 
 *//** 高さ */
/*
 * @Column(name="HEIGHT") private double height;
 * 
 *//** 重さ */
/*
 * @Column(name="WEIGHT") private double weight;
 * 
 *//** Getter Setter */
/*
 * 
 * public int getPokemonId() { return pokemonId; }
 * 
 * 
 * 
 * @ManyToOne private Department department;
 * 
 * public User() { }
 * 
 * 
 * 
 * public void setPokemonId(int pokemonId) { this.pokemonId = pokemonId; }
 * 
 * public String getPokemonJpName() { return pokemonJpName; }
 * 
 * public void setPokemonJpName(String pokemonJpName) { this.pokemonJpName =
 * pokemonJpName; }
 * 
 * public String getPokemonEnName() { return pokemonEnName; }
 * 
 * public void setPokemonEnName(String pokemonEnName) { this.pokemonEnName =
 * pokemonEnName; }
 * 
 * public double getHeight() { return height; }
 * 
 * public void setHeight(double height) { this.height = height; }
 * 
 * public double getWeight() { return weight; }
 * 
 * public void setWeight(double weight) { this.weight = weight; }
 * 
 * 
 * 
 * 
 * 
 *//** タイプ *//*
				 * @Column(name="TYPE_ID") private int typeId;
				 * 
				 * 
				 * 
				 * public int getTypeId() { return typeId; }
				 * 
				 * public void setTypeId(int typeId) { this.typeId = typeId; }
				 * 
				 * 
				 * 
				 * }
				 */
package principal.mysql.hibernate.Models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Car.class)
public abstract class Car_ {

	public static volatile SingularAttribute<Car, String> patent;
	public static volatile SingularAttribute<Car, String> name;
	public static volatile SingularAttribute<Car, Integer> id;

	public static final String PATENT = "patent";
	public static final String NAME = "name";
	public static final String ID = "id";

}


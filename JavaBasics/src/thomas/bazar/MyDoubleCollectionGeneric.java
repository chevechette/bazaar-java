package thomas.bazar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ajc.basics.Orc;
/**
 * one list of a generic type
 * one map of two generic types
 * @author thomaslhomme
 *
 * @param <T>
 */
public class MyDoubleCollectionGeneric<T1, T2, T3> {
	public T1 weapon;
	public List<T1> list = new ArrayList<>();
	public Map<T2, T3> map = new HashMap<>();

}

package Test;

import java.util.Map;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMap {
	private Map<String, Integer> mapa;
	
	
	@BeforeEach
	public void setup() {
		this.mapa = new HashMap<String, Integer>();	//HashMap valido?
		mapa.put("Lionel Messi", 111);
		mapa.put("Gabriel Batistuta", 56);
		mapa.put("Kun Aguero", 42);
	}
	
	@Test
	public void testTareas() {
		mapa.remove("Kun Aguero");
		assertEquals(mapa.containsKey("Kun Aguero"),false);
		mapa.replace("Lionel Messi", 112);
		assertEquals(mapa.get("Lionel Messi"),112);
		mapa.put("Gabriel Batistuta", 56);	//que instruccion tengo que usar?
		assertEquals(mapa.get("Gabriel Batistuta"), 56);
		assertEquals(mapa.values().stream().mapToInt(d -> d).sum() , 168);	//??
	}
	
	
	
	
	
}

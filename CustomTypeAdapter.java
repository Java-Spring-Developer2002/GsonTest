package MDM;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Date;

public class CustomTypeAdapter implements JsonSerializer<Custom>,JsonDeserializer<Custom> {
    public Custom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject object = jsonElement.getAsJsonObject();
        Date date = new Date(object.get("date").getAsString());
        BigInteger integer = new BigInteger(object.get("integer").getAsString());

        return new Custom(date,integer);
    }

    public JsonElement serialize(Custom custom, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject object = new JsonObject();
        object.addProperty("date",custom.getDate().toString());
        object.addProperty("integer",custom.getInteger().toString());
        return object;
    }
}

import redis.clients.jedis.Jedis;

public class RedisConfig {
    private Jedis jedis;

    public RedisConfig() {
        // Connect to Redis service in Docker Compose network
        jedis = new Jedis("redis", 6379); // "redis" is the service name in Docker Compose
    }

    public Jedis getJedis() {
        return jedis;
    }
}

package com.binance4j.client;

import com.binance4j.core.exception.ApiException;
import com.binance4j.service.TestService;
import com.binance4j.wallet.client.WalletClient;
import com.binance4j.wallet.snapshot.AccountSnapshotRequest;
import com.binance4j.wallet.snapshot.margin.MarginAccountSnapshotResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMarginAccountSnapshotTest {
	final WalletClient client = TestService.CLIENT;

	@Test
	@DisplayName("It should return the snapshot or throw an exception if you don't have a margin account")
	void testGetMarginAccountSnapshot() {
		try {
			MarginAccountSnapshotResponse snapshot = client.getMarginAccountSnapshot().execute();
			test(snapshot);
		} catch (ApiException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}

	@Test
	@DisplayName("It should return the snapshot with the good size or throw an exception if you don't have a margin account")
	void testMarginAccountSnapshotWithLimit() {
		assertDoesNotThrow(() -> {

			int limit = 25;
			AccountSnapshotRequest req = new AccountSnapshotRequest(limit);
			MarginAccountSnapshotResponse snapshot = client.getMarginAccountSnapshot(req).execute();
			test(snapshot);
		});
	}

	void test(MarginAccountSnapshotResponse snapshot) {
		System.out.println(snapshot);
		assertNotEquals(0, snapshot.getCode());
		assertNotNull(snapshot.getMsg());

		snapshot.getSnapshotVos().forEach(s -> {
			System.out.println(s);
			assertNotNull(s.getType());
			assertNotNull(s.getUpdateTime());
			// can be null
			// assertNotNull(s.getData().getMarginLevel());
			assertNotNull(s.getData().getTotalAssetOfBtc());
			assertNotNull(s.getData().getTotalLiabilityOfBtc());
			assertNotNull(s.getData().getTotalNetAssetOfBtc());
			s.getData().getUserAssets().forEach(ua -> {
				assertNotNull(ua.getAsset());
				assertNotNull(ua.getBorrowed());
				assertNotNull(ua.getFree());
				assertNotNull(ua.getInterest());
				assertNotNull(ua.getLocked());
				assertNotNull(ua.getNetAsset());
			});
		});
	}
}

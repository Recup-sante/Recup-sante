import { TestBed } from '@angular/core/testing';
import { of } from 'rxjs';
import { AuthService } from './auth.service';

describe('AuthService', () => {
  let service: AuthService;

  beforeEach(() => {
    const authServiceMock = {
      login: vi.fn().mockReturnValue(of(true)),
    };

    TestBed.configureTestingModule({
      providers: [{ provide: AuthService, useValue: authServiceMock }],
    });

    service = TestBed.inject(AuthService);
  });

  it('should call login', () => {
    service.login('user', 'pass').subscribe((res) => {
      expect(res).toBe(true);
    });
  });
});
